CREATE TABLE modules
(
    name    STRING,
    size    INTEGER,
    purpose STRING,
    PRIMARY KEY (name),
    CHECK (size > 0)
    );

CREATE TABLE submodules
(
    name        STRING,
    module_name STRING,
    size        INTEGER,
    purpose     STRING,
    PRIMARY KEY (name),
    FOREIGN KEY (module_name) REFERENCES modules (name)
);

CREATE VIEW v AS
SELECT
        size, (size * 5) AS size_times_5
        FROM modules
        GROUP BY size, name
        ORDER BY size_times_5;