**Async programming**

```
There are instances where we do not need to block our threads, for instance
email application for acknowledgement.

```

```
In application development there are times we may give our users, acknowldgements,
rather than making them wait for the whole prcess to complete.

Payment Service

(a) Making an Order till payment

(We can give a prior acknowledgement that order has been successfully processed)
 
(b)Notifications & dispatch on the vendor etc

(For instance, Order SMS & Order Email, they can be generated in the background,
and sent to the user)

(Rather than making the user wait for all this)
(For instance i can tell a user that the confirmation email will be sent to
them shortly)

(By doing this, i am not locking the user or making the user have to wait
uncessarilty)

(My system performance also imptoves significanty, especially when there
are many people making requests at the same time.

(This is because every async call is executed in a seperate thread)

(We can let the above process run asynchornously.
 
```

**Configuring Async**

```
I begin by creating an Async configuration and add my custom threadConfigs.(By doing this i am 
creating my custom thread pool, that i can call to use.)

(This is by configuring a bean of ThreadPoolTaskExecutor)

I then annotate methods i want executed asynchornously with @Async("QualifierName")

I can have more than one threadPool config,therefore in that case i can use QualifierNames.

N/B
(Async methods, either return a compleatable of void or a compleatable of Null)

```

**Big Takeway**

```
Running processes async greatly improves performance since we are making maximum
use of our threads.

if i have a method that is not async. then if i am making 10 requests, the requests
will all run in a single thread, However when using async, the requests will run
in different threads.

```