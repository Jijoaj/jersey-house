INSERT INTO COUNTRY (country_code, country_name) VALUES(1, 'SAMPLE_COUNTRY');
INSERT INTO LEAGUE (LEAGUE_CODE, LEAGUE_NAME) VALUES (1, 'SAMPLE League');
INSERT INTO  league_availability  (id,country_code, LEAGUE_CODE) VALUES  (1, 1, 1);
INSERT INTO  season  (SEASON_CODE, START_YEAR, END_YEAR) VALUES  (1, 2000, 2001);
INSERT INTO  teams(TEAM_ID, TEAM_NAME, SHORT_NAME, LEAGUE_CODE) VALUES(1,'TEAM','TEA',1);
INSERT INTO jersey (id, team_code, size, stock, season_code, image_url) VALUES (NEXTVAL('JERSEY_SEQ'), 1, 's', 1, 1, 'https://test');

