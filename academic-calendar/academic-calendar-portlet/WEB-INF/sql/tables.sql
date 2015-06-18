create table AcademicEvents_Event (
	eventId LONG not null primary key,
	name_hu VARCHAR(255) null,
	name_en VARCHAR(255) null,
	eventDate DATE null,
	tvsz VARCHAR(75) null,
	typeofEvent LONG
);