databaseChangeLog = {

	changeSet(author: "admin (generated)", id: "1419486702434-1") {
		modifyDataType(columnName: "published", newDataType: "boolean", tableName: "blog_post")
	}

	changeSet(author: "admin (generated)", id: "1419486702434-2") {
		modifyDataType(columnName: "title", newDataType: "text", tableName: "blog_post")
	}

	changeSet(author: "admin (generated)", id: "1419486702434-3") {
		modifyDataType(columnName: "invalidated", newDataType: "boolean", tableName: "persistent_session")
	}

	changeSet(author: "admin (generated)", id: "1419486702434-4") {
		addPrimaryKey(columnNames: "id", constraintName: "list_projectsPK", tableName: "list_projects")
	}
}
