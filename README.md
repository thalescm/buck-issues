# kotlinWithBuckCompilerBug

Today it's not possible to pass `K2JVMCompilerArguments.friendPaths` to the compiler CLI, which is a 
needed step in order to make main source sets `internal` fields/classes, etc.. visible to test sources. 
(setting only `module-name` when compiling each module (main and test) is not enough, as this project shows)

The purpose in this is to expose and make it easy to reproduce this "bug"

## running 
`./gradlew buckWrapper`
`./buckw build //lib:test_debug` (this make take sometime if buck is not yet set)

Note you need to have ndk version 15.2.4203891 or *below*, and the environments variables:    
`ANDROID_NDK`=`$ANDROID_HOME/ndk-bundle`  
`ANDROID_NDK_REPOSITORY`=`$ANDROID_HOME`
