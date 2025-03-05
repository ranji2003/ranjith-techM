class FitnessPlanner {
    constructor() {
        this.routines = [];
        this.storageKey = "fitness_routines";
        this.loadRoutines();
    }

    saveToStorage() {
        localStorage.setItem(this.storageKey, JSON.stringify(this.routines));
    }

    loadRoutines() {
        const savedRoutines = localStorage.getItem(this.storageKey);
        this.routines = savedRoutines ? JSON.parse(savedRoutines) : [];
    }

    addRoutine(name) {
        const newRoutine = {
            id: Date.now(),
            name
        };
        this.routines.push(newRoutine);
        this.saveToStorage();
    }

    getAllRoutines() {
        return this.routines;
    }

    removeRoutine(id) {
        this.routines = this.routines.filter(routine => routine.id !== id);
        this.saveToStorage();
    }

    clearAllRoutines() {
        this.routines = [];
        localStorage.removeItem(this.storageKey);
    }
}

const planner = new FitnessPlanner();

document.addEventListener("DOMContentLoaded", () => {
    const saveRoutineBtn = document.getElementById("save-routine");
    const routineInput = document.getElementById("routine-name");
    const routineList = document.getElementById("routine-list");

    if (saveRoutineBtn && routineInput) {
        saveRoutineBtn.addEventListener("click", () => {
            const routineName = routineInput.value.trim();
            if (routineName) {
                planner.addRoutine(routineName);
                routineInput.value = "";
                updateRoutineList();
            }
        });
    }

    function updateRoutineList() {
        if (!routineList) return;

        routineList.innerHTML = "";
        const routines = planner.getAllRoutines();

        routines.forEach((routine) => {
            const li = document.createElement("li");
            li.textContent = routine.name;

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

    updateRoutineList();
});
