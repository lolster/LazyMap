# LazyMap
### A lazy map function for Java

The LazyMap is inspired by the functional **map** available in Python3. A LazyMap object, instantiated with the Predicate function and the sequence, executes the mapping on the sequence only when it is necessary. The mapper can be applied on specific elements or on the entire sequence. The LazyMap supports Generic classes as well.

An additional feature is Persistence, using standard Java serialization. The LazyMap can be stored/loaded by the user on the filesystem.

The following design patterns have be used:

* Iterator
* Proxy
* Abstract Factory method
