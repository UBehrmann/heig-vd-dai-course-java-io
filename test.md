| Tests                 | 1b    | 1KiB  | 1MiB   | 5Mib    |
|-----------------------|-------|-------|--------|---------|
| Binary write          | 119ms | 120ms | 2045ms | 9822ms  |
| Buffered binary write | 121ms | 116ms | 127ms  | 149ms   |
| Text write            | 118ms | 122ms | 207ms  | 373ms   |
| Buffered text write   | 119ms | 180ms | 161ms  | 213ms   |
| Binary read           | 116ms | 137ms | 3691ms | 17971ms |
| Buffered binary read  | 116ms | 135ms | 2487ms | 12254ms |
| Text read             | 122ms | 135ms | 2837ms | 12749ms |
| Buffered text read    | 118ms | 133ms | 3071ms | 12962ms |

# CLI COMMANDS

```bash
  java -jar target/java-ios-1.0-SNAPSHOT.jar -i=IMPLEMENTATION FILENAME COMMAND -s=FILESIZE
```

# IMPLEMENTATION

- BINARY
- BUFFERED_BINARY
- TEXT
- BUFFERED_TEXT

# COMMAND

- read
- write

# FILESIZE

- 1b = 1B
- 1KiB = 1024B
- 1MiB = 1048576B
- 5Mib = 5242880B

java -jar target/java-ios-1.0-SNAPSHOT.jar -i=BUFFERED_TEXT bufferedTextWrite1b.txt write -s=1
