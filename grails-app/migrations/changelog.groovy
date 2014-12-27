databaseChangeLog = {

	changeSet(author: "admin (generated)", id: "1419485990282-1") {
		createTable(tableName: "blog_post") {
			column(name: "id", type: "int8") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "blog_postPK")
			}

			column(name: "version", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "html_content", type: "text") {
				constraints(nullable: "false")
			}

			column(defaultValue: "0", name: "post_order", type: "int4") {
				constraints(nullable: "false")
			}

			column(defaultValue: "true", name: "published", type: "boolean") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "admin (generated)", id: "1419485990282-2") {
		createTable(tableName: "list_projects") {
			column(name: "id", type: "int8") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "list_projectsPK")
			}

			column(name: "version", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "due_date", type: "timestamp") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "admin (generated)", id: "1419485990282-3") {
		createTable(tableName: "persistent_session") {
			column(name: "id", type: "varchar(255)") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "persistent_sePK")
			}

			column(name: "creation_time", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "invalidated", type: "boolean") {
				constraints(nullable: "false")
			}

			column(name: "last_accessed_time", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "max_inactive_interval", type: "int4") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "admin (generated)", id: "1419485990282-4") {
		createTable(tableName: "persistent_session_attribute") {
			column(name: "id", type: "int8") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "persistent_sePK")
			}

			column(name: "version", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "session_id", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "admin (generated)", id: "1419485990282-5") {
		createTable(tableName: "persistent_session_attribute_value") {
			column(name: "id", type: "int8") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "persistent_sePK")
			}

			column(name: "version", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "attribute_id", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "serialized", type: "bytea") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "admin (generated)", id: "1419485990282-8") {
		createSequence(sequenceName: "hibernate_sequence")
	}

	changeSet(author: "admin (generated)", id: "1419485990282-6") {
		addForeignKeyConstraint(baseColumnNames: "session_id", baseTableName: "persistent_session_attribute", constraintName: "FK_rfna9d2pqmppo28o4ljilefls", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "persistent_session", referencesUniqueColumn: "false")
	}

	changeSet(author: "admin (generated)", id: "1419485990282-7") {
		addForeignKeyConstraint(baseColumnNames: "attribute_id", baseTableName: "persistent_session_attribute_value", constraintName: "FK_s5b890xbb8px0dy35dpl1a4kn", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "persistent_session_attribute", referencesUniqueColumn: "false")
	}
}
