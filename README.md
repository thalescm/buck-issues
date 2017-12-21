# Buck Issues

This project contains all issues I'm encountering when trying to setup buck in a more complex
project than the ones normally available as samples.


## It's not possible to test kotlin files which reference `internal` classes 
Branch: [kotlin-internal](https://github.com/thalescm/buck-issues/tree/kotlin-internal)

## You cannot have shared resources between androidTests and tests folder
Branch: < still coming>

## You cannot build instrumentation apk for android libraries
Branch: < still coming>

### Note 

For all projects, you need to have ndk version 15.2.4203891 or *below*, and the environments variables:    
`ANDROID_NDK`=`$ANDROID_HOME/ndk-bundle`  
`ANDROID_NDK_REPOSITORY`=`$ANDROID_HOME`
