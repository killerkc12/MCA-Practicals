# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.19

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /home/kiran/.local/share/JetBrains/Toolbox/apps/CLion/ch-0/211.6693.114/bin/cmake/linux/bin/cmake

# The command to remove a file.
RM = /home/kiran/.local/share/JetBrains/Toolbox/apps/CLion/ch-0/211.6693.114/bin/cmake/linux/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "/media/kiran/Work-Space/FYMCA/DS/Assignment 6"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/media/kiran/Work-Space/FYMCA/DS/Assignment 6/cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/Assignment_6.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Assignment_6.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Assignment_6.dir/flags.make

CMakeFiles/Assignment_6.dir/main.c.o: CMakeFiles/Assignment_6.dir/flags.make
CMakeFiles/Assignment_6.dir/main.c.o: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/media/kiran/Work-Space/FYMCA/DS/Assignment 6/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/Assignment_6.dir/main.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Assignment_6.dir/main.c.o -c "/media/kiran/Work-Space/FYMCA/DS/Assignment 6/main.c"

CMakeFiles/Assignment_6.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Assignment_6.dir/main.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E "/media/kiran/Work-Space/FYMCA/DS/Assignment 6/main.c" > CMakeFiles/Assignment_6.dir/main.c.i

CMakeFiles/Assignment_6.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Assignment_6.dir/main.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S "/media/kiran/Work-Space/FYMCA/DS/Assignment 6/main.c" -o CMakeFiles/Assignment_6.dir/main.c.s

# Object files for target Assignment_6
Assignment_6_OBJECTS = \
"CMakeFiles/Assignment_6.dir/main.c.o"

# External object files for target Assignment_6
Assignment_6_EXTERNAL_OBJECTS =

Assignment_6: CMakeFiles/Assignment_6.dir/main.c.o
Assignment_6: CMakeFiles/Assignment_6.dir/build.make
Assignment_6: CMakeFiles/Assignment_6.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="/media/kiran/Work-Space/FYMCA/DS/Assignment 6/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable Assignment_6"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Assignment_6.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Assignment_6.dir/build: Assignment_6

.PHONY : CMakeFiles/Assignment_6.dir/build

CMakeFiles/Assignment_6.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/Assignment_6.dir/cmake_clean.cmake
.PHONY : CMakeFiles/Assignment_6.dir/clean

CMakeFiles/Assignment_6.dir/depend:
	cd "/media/kiran/Work-Space/FYMCA/DS/Assignment 6/cmake-build-debug" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/media/kiran/Work-Space/FYMCA/DS/Assignment 6" "/media/kiran/Work-Space/FYMCA/DS/Assignment 6" "/media/kiran/Work-Space/FYMCA/DS/Assignment 6/cmake-build-debug" "/media/kiran/Work-Space/FYMCA/DS/Assignment 6/cmake-build-debug" "/media/kiran/Work-Space/FYMCA/DS/Assignment 6/cmake-build-debug/CMakeFiles/Assignment_6.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Assignment_6.dir/depend

