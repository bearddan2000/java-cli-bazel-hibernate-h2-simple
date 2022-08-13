java_binary (
    name = "BazelApp",
    srcs = glob(["java/**/*.java"]),
    main_class = "example.Main",
    deps = [
      "@maven//:com_h2database_h2",
      "@maven//:log4j_log4j",
      "@maven//:org_slf4j_slf4j_api",
      "@maven//:org_slf4j_slf4j_log4j12"
    ],
    resources = [
      "resources/log4j.xml",
      "resources/hibernate.cfg.xml",
    ],
)
