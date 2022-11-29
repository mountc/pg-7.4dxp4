create index IX_F96D1A02 on CS_Events (groupId, department[$COLUMN_LENGTH:75$]);
create index IX_933DC022 on CS_Events (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_641BE724 on CS_Events (uuid_[$COLUMN_LENGTH:75$], groupId);