package com.github.marschall.memoryfilesystem.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;

class WindowsMemoryTempDirTests {

  @WindowsMemoryTempDir
  Path tempDirectory;

  @Test
  void customFactory() {
    MemoryFileSystemAssertions.assertMemoryDirectory(this.tempDirectory);

    String separator = this.tempDirectory.getFileSystem().getSeparator();
    assertEquals("\\", separator, "separator");
    
    Iterable<Path> rootDirectories = this.tempDirectory.getFileSystem().getRootDirectories();
  }

}
