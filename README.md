# LazyMap
### A lazy map function for Java

The LazyMap is inspired by the functional `map` available in Python3. A `LazyMap` object, instantiated with the `Predicate` function and the sequence, executes the mapping on the sequence only when it is necessary. The mapper can be applied on specific elements or on the entire sequence. The `LazyMap` is generic as well, so it can be used for various user defined classes.

An additional feature is Persistence, using standard Java serialization. The LazyMap can be stored/loaded by the user on the filesystem (in a lazy manner).

The following major design patterns have be used:

* Iterator
* Proxy
* Abstract Factory method

# Authors

```text
 * Sushrith Arkal  (01FB14ECS262)
 * Varun Bharadwaj (01FB14ECS278)
 * Varun Majunath  (01FB14ECS280)
 * Suhas Kashyap   (01FB14ECS255)

 7th Semester,
 CSE Deptartment,
 PES University, 
 Bangalore, India
```