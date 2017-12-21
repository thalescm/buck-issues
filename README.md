# Kotlin `internal` classes not accessible from test code

*Current Status* -> Issue reported at [YouTrack](https://youtrack.jetbrains.com/issue/KT-21910)

Today it's not possible to pass `K2JVMCompilerArguments.friendPaths` to the compiler CLI, which is a
needed step in order to make main source sets `internal` fields/classes, etc.. visible to test sources.
(setting only `module-name` when compiling each module (main and test) is not enough, as this project shows)

The purpose in this is to expose and make it easy to reproduce this "bug"

As of now, it's better to have buck installed in order to test this (explained below)
## running (buck installed)

`buck build //lib:test_debug`

## running (buck not installed)
`./gradlew buckWrapper`
`./buckw build //lib:test_debug`

Note that this will remove '-module-name' and 'lib_debug' from `extra_kotlinc_arguments` on `src_debug` and `test_debug` rules, which is also needed for the compiler to recognize
the test module is the same module as the main one.
(Will open an issue on [okBuck](https://github.com/uber/okbuck/) once kotlin's one is fixed)


## Note
You need to have ndk version 15.2.4203891 or *below*, and the environments variables:    
`ANDROID_NDK`=`$ANDROID_HOME/ndk-bundle`  
`ANDROID_NDK_REPOSITORY`=`$ANDROID_HOME`
