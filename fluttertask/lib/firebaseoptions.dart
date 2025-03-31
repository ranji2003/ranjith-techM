import 'package:firebase_core/firebase_core.dart' show FirebaseOptions;
import 'package:flutter/foundation.dart'
    show defaultTargetPlatform, kIsWeb, TargetPlatform;

/// Default [FirebaseOptions] for use with your Firebase apps.
///
/// Example:
/// ```dart
/// import 'firebase_options.dart';
/// // ...
/// await Firebase.initializeApp(
///   options: DefaultFirebaseOptions.currentPlatform,
/// );
/// ```
class DefaultFirebaseOptions {
  static FirebaseOptions get currentPlatform {
    if (kIsWeb) {
      return web;
    }
    switch (defaultTargetPlatform) {
      case TargetPlatform.android:
        return android;
      case TargetPlatform.iOS:
        return ios;
      case TargetPlatform.macOS:
        return macos;
      case TargetPlatform.windows:
        throw UnsupportedError(
          'DefaultFirebaseOptions have not been configured for windows - '
          'you can reconfigure this by running the FlutterFire CLI again.',
        );
      case TargetPlatform.linux:
        throw UnsupportedError(
          'DefaultFirebaseOptions have not been configured for linux - '
          'you can reconfigure this by running the FlutterFire CLI again.',
        );
      default:
        throw UnsupportedError(
          'DefaultFirebaseOptions are not supported for this platform.',
        );
    }
  }

  static const FirebaseOptions web = FirebaseOptions(
    apiKey: 'AIzaSyADNVi__ByTbvutrXRb91RmVBAV3k3Aq5I',
    appId: '1:214741830219:web:190aeac03e608e680a1bce',
    messagingSenderId: '214741830219',
    projectId: 'firedev-64a4e',
    authDomain: 'firedev-64a4e.firebaseapp.com',
    storageBucket: 'firedev-64a4e.appspot.com',
    measurementId: 'G-74ECXXMYX6',
  );

  static const FirebaseOptions android = FirebaseOptions(
    apiKey: 'AIzaSyC4CzOw1WpiaYgYVEGJrjRYSFw0O4B1nsY',
    appId: '1:214741830219:android:16fcf234d5952b4b0a1bce',
    messagingSenderId: '214741830219',
    projectId: 'firedev-64a4e',
    storageBucket: 'firedev-64a4e.appspot.com',
  );

  static const FirebaseOptions ios = FirebaseOptions(
    apiKey: 'AIzaSyDKaWQy0YE90UyH4zCubaKGvgZscWBQlM4',
    appId: '1:214741830219:ios:43c096c5c70f08280a1bce',
    messagingSenderId: '214741830219',
    projectId: 'firedev-64a4e',
    storageBucket: 'firedev-64a4e.appspot.com',
    iosClientId: '214741830219-fjpidhvj9k9l2q3iu1r361kmieqknbqq.apps.googleusercontent.com',
    iosBundleId: 'com.example.firedev',
  );

  static const FirebaseOptions macos = FirebaseOptions(
    apiKey: 'AIzaSyDKaWQy0YE90UyH4zCubaKGvgZscWBQlM4',
    appId: '1:214741830219:ios:e84c2465a88166950a1bce',
    messagingSenderId: '214741830219',
    projectId: 'firedev-64a4e',
    storageBucket: 'firedev-64a4e.appspot.com',
    iosClientId: '214741830219-e9tv3qol79a3c4hp13f44slqpp7hb1o6.apps.googleusercontent.com',
    iosBundleId: 'com.example.firedev.RunnerTests',
  );
}
