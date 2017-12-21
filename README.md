# You cannot have shared resources between androidTests and tests folder

*Current Status* -> Issue reported at [buck](https://github.com/facebook/buck/issues/1693)

I'm not able to share resources with `test` folder and `androidTest` folder.
it doesn't find `thales.json` for unit tests, when that resource is under `sharedTest/resources/` folder.
kt classes under `sharedTest/java` folder are normally found.
 
## Running

buck test //app:test_debug

## Note

okbuck will not try to add resources as well. Will submit an issue there once buck's one is fixed
