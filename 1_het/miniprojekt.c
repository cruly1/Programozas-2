#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void generate_c() {
    FILE * fp = fopen("main.c", "w");
    fprintf(fp, "#include <stdio.h>\n\nint main() {\n    printf(\"Hello World!\\n\");\n\n    return 0;\n}\n");
    fprintf(stdout, "File main.c is being generated!\n");
    fclose(fp);
}

void generate_java() {
    FILE * fp = fopen("Main.java", "w");
    fprintf(fp, "public class Main {\n    public static void main(String[] args) {\n        System.out.println(\"Hello World!\");\n    }\n}\n");
    fprintf(stdout, "File Main.java is being generated!\n");
    fclose(fp);
}

void generate_py() {
    FILE * fp = fopen("main.py", "w");
    fprintf(fp, "#!/usr/bin/env python3\n\n\ndef main():\n    print(\"Hello World!\")\n\n\nif __name__ == \"__main__\":\n    main()\n");
    fprintf(stdout, "File main.py is being generated!\n");
    fclose(fp);
}

void generate_cpp() {
    FILE * fp = fopen("main.cpp", "w");
    fprintf(fp, "#include <iostream>\n\nint main() {\n    std::cout << \"Hello World!\" << std::endl;\n\n    return 0;\n}\n");
    fprintf(stdout, "File main.cpp is being generated!\n");
    fclose(fp);
}

void generate_cs() {
    FILE * fp = fopen("Program.cs", "w");
    fprintf(fp, "using static System.Console;\n\nnamespace Program\n{\n    class Main\n    {\n        public static void Main(string[] args)\n        {\n            WriteLine(\"Hello World!\");\n        }\n    }\n}\n");
    fprintf(stdout, "File Program.cs is being generated!\n");
    fclose(fp);
}

void generate_go() {
    FILE * fp = fopen("main.go", "w");
    fprintf(fp, "package main\n\nimport \"fmt\"\n\nfunc main() {\n    fmt.Println(\"Hello World!\")\n}\n");
    fprintf(stdout, "File main.go is being generated.\n");
    fclose(fp);
}

void access_file_c() {
    FILE * fp = fopen("main.c", "r");

    if (fp != NULL) {
        fprintf(stderr, "Error! File main.c alredy exists.\n");
        exit(1);
    }

    generate_c();
}

void access_file_java() {
    FILE * fp = fopen("Main.java", "r");

    if (fp != NULL) {
        fprintf(stderr, "Error! File Main.java alredy exists.\n");
        exit(1);
    }

    generate_java();
}

void access_file_py() {
    FILE * fp = fopen("main.py", "r");

    if (fp != NULL) {
        fprintf(stderr, "Error! File main.py alredy exists.\n");
        exit(1);
    }

    generate_py();
}

void access_file_cpp() {
    FILE * fp = fopen("main.cpp", "r");

    if (fp != NULL) {
        fprintf(stderr, "Error! File main.cpp already exists.\n");
        exit(1);
    }

    generate_cpp();
}

void access_file_cs() {
    FILE * fp = fopen("Program.cs", "r");

    if (fp != NULL) {
        fprintf(stderr, "Error! File Program.cs alredy exists.\n");
        exit(1);
    }

    generate_cs();
}

void access_file_go() {
    FILE * fp = fopen("main.go", "r");

    if (fp != NULL) {
        fprintf(stderr, "Error! File main.go alredy exists.\n");
        exit(1);
    }

    generate_go();
}

void stdout_c() {
    printf("#include <stdio.h>\n\nint main() {\n    printf(\"Hello World!\\n\");\n\n    return 0;\n}\n");
}

void stdout_java() {
    printf("public class Main {\n    public static void main(String[] args)\n        System.out.println(\"Hello World!\")\n    }\n}\n");
}

void stdout_py() {
    printf("#!/usr/bin/env python3\n\n\ndef main():\n    print(\"Hello World!\")\n\n\nif __name__ == \"__main__\":\n    main()\n");
}

void stdout_cpp() {
    printf("#include <iostream>\n\nint main() {\n    std::cout << \"Hello World!\" << std::endl;\n\n    return 0;\n}\n");
}

void stdout_cs() {
    printf("using static System.Console;\n\nnamespace Program\n{\n    class Main\n    {\n        public static void Main(string[] args)\n        {\n            WriteLine(\"Hello World!\");\n        }\n    }\n}\n");
}

void stdout_go() {
    printf("package main\n\nimport \"fmt\"\n\nfunc main() {\n    fmt.Println(\"Hello World!\")\n}\n");
}

void display_version() {
    char* version = "v1.1.5";
    printf("version: %s\n", version);
}

void default_stdout() {
    display_version();

    printf("\nOptions:\n\n");
    printf("-h, --help\n");
    printf("-v, --version\n");
    printf("--stdout\n\n");
    printf("Templates:\n\n");
    printf("* c\n* py\n* java\n* cpp\n* cs\n* go\n");
}

int main(int argc, char* argv[]) {
    if (argc == 1) {
        default_stdout();
    }

    if (argc == 2) {
        if (strcmp(argv[1], "c") == 0) {
            access_file_c();
        } else if (strcmp(argv[1], "java") == 0) {
            access_file_java();
        } else if (strcmp(argv[1], "py") == 0) {
            access_file_py();
        } else if (strcmp(argv[1], "cpp") == 0) {
            access_file_cpp();
        } else if (strcmp(argv[1], "cs") == 0) {
            access_file_cs();
        } else if (strcmp(argv[1], "go") == 0) {
            access_file_go();
        } else if (strcmp(argv[1], "-v") == 0 || strcmp(argv[1], "--version") == 0) {
            display_version();
        } else if (strcmp(argv[1], "-h") == 0 || strcmp(argv[1], "--help") == 0) {
            default_stdout();
        }
    }

    if (argc == 3 && strcmp(argv[2], "--stdout") == 0) {
        if (strcmp(argv[1], "c") == 0) {
            stdout_c();
        } else if (strcmp(argv[1], "java") == 0) {
            stdout_java();
        } else if (strcmp(argv[1], "py") == 0) {
            stdout_py();
        } else if (strcmp(argv[1], "cpp") == 0) {
            stdout_cpp();
        } else if (strcmp(argv[1], "cs") == 0) {
            stdout_cs();
        } else if (strcmp(argv[1], "go") == 0) {
            stdout_go();
        }
    }

    return 0;
}
