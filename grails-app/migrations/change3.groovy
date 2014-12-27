databaseChangeLog = {

	changeSet(author: "admin (generated)", id: "1419489841513-1") {
		addColumn(tableName: "blog_post") {
			column(name: "date_created", type: "timestamp") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "admin (generated)", id: "1419489841513-2") {
		modifyDataType(columnName: "published", newDataType: "boolean", tableName: "blog_post")
	}

	changeSet(author: "admin (generated)", id: "1419489841513-3") {
		modifyDataType(columnName: "title", newDataType: "text", tableName: "blog_post")
	}

	changeSet(author: "admin (generated)", id: "1419489841513-4") {
		modifyDataType(columnName: "invalidated", newDataType: "boolean", tableName: "persistent_session")
	}

	changeSet(author: "admin (generated)", id: "1419489841513-5") {
		addPrimaryKey(columnNames: "id", constraintName: "list_projectsPK", tableName: "list_projects")
	}
}
