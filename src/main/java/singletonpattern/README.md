The singleton pattern is one of the simplest design patterns. Sometimes we need to have only one instance of our class for example a single DB connection shared by multiple objects as creating a separate DB connection for every object may be costly. Similarly, there can be a single configuration manager or error manager in an application that handles all problems instead of creating multiple managers

In most of the cases, singleton pattern can be used to cache the values in application. For example, there is a configuration that you need to pull from DB that is most likely not to be changed frequently. In this case, making DB calls repetitively is an expensive task.  

Instead of that, you can load the values into a singleton class and use this class as a reference for configuration, instead of making multiple DB calls.