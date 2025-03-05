interface Routine {
    id: number;
    name: string;
}

class FitnessPlanner {
    private routines: Routine[] = [];
    private storageKey = "fitness_routines";

    constructor() {
        this.loadRoutines();
    }

    private saveToStorage(): void {
        localStorage.setItem(this.storageKey, JSON.stringify(this.routines));
    }

    private loadRoutines(): void {
        const savedRoutines = localStorage.getItem(this.storageKey);
        this.routines = savedRoutines ? JSON.parse(savedRoutines) : [];
    }

    addRoutine(name: string): void {
        const newRoutine: Routine = {
            id: Date.now(),
            name
        };
        this.routines.push(newRoutine);
        this.saveToStorage();
    }

    getAllRoutines(): Routine[] {
        return this.routines;
    }

    removeRoutine(id: number): void {
        this.routines = this.routines.filter(routine => routine.id !== id);
        this.saveToStorage();
    }

    clearAllRoutines(): void {
        this.routines = [];
        localStorage.removeItem(this.storageKey);
    }
}

// Create only one instance of the planner
const planner = new FitnessPlanner();

// Function to handle saving a routine from the input field
document.addEventListener("DOMContentLoaded", () => {
    const saveRoutineBtn = document.getElementById("save-routine") as HTMLButtonElement;
    const routineInput = document.getElementById("routine-name") as HTMLInputElement;
    const routineList = document.getElementById("routine-list") as HTMLUListElement;

    if (saveRoutineBtn && routineInput) {
        saveRoutineBtn.addEventListener("click", () => {
            const routineName = routineInput.value.trim();
            if (routineName) {
                planner.addRoutine(routineName);
                routineInput.value = ""; // Clear input
                updateRoutineList();
            }
        });
    }

    // Function to display saved routines
    function updateRoutineList() {
        if (!routineList) return;

        routineList.innerHTML = ""; // Clear the list before updating
        const routines = planner.getAllRoutines();

        routines.forEach((routine) => {
            const li = document.createElement("li");
            li.textContent = routine.name;

            // Delete button for each routine
            const deleteBtn = document.createElement("button");
            deleteBtn.textContent = "Remove";
            deleteBtn.style.marginLeft = "10px";
            deleteBtn.onclick = () => {
                planner.removeRoutine(routine.id);
                updateRoutineList();
            };

            li.appendChild(deleteBtn);
            routineList.appendChild(li);
        });
    }

    // Load routines when the page loads
    updateRoutineList();
});
