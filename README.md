# You cannot build instrumentation apk for android libraries

Today it's not possible to build a test apk for a library with buck without defining a target
apk.
This is possible with gradle, as this example shows:

`./gradlew lib:assembleDebugAndroidTest`  
`adb install lib/build/outputs/apk/lib-debug-androidTest.apk`  
`adb shell am instrument -w -r -e debug false machado.thales.lib.test/android.support.test.runner.AndroidJUnitRunner`

And then tests are run normally
It's not currently possible on buck to make a rule without a target apk


## OkBuck do not generate android_instrumentation_apk() rules for libraries

This issue will be created once the previous issue is fixed with buck
