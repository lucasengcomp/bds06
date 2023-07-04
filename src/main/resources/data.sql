INSERT INTO tb_user (name, email, password) VALUES ('Bob', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Ana', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_VISITOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_genre (name) VALUES ('Ação');
INSERT INTO tb_genre (name) VALUES ('Romance');
INSERT INTO tb_genre (name) VALUES ('Drama');

INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('Velozes e Furiosos 9', null, 2021, 'https://br.depositphotos.com/stock-photos/oceano.html', 'Dominic Toretto e sua equipe se juntam novamente para enfrentar o irmão desaparecido de Dom, Jakob, um assassino habilidoso que está trabalhando com Cipher.', 1);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('After', null, 2019, 'https://br.depositphotos.com/stock-photos/oceano.html', 'Tessa Young é uma jovem de 18 anos que acaba de ingressar na faculdade. De vida estável e um namorado doce, Tessa tem a vida que planejou.', 2);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('Viúva Negra', null, 2021, 'https://br.depositphotos.com/stock-photos/oceano.html', 'Após os eventos de Capitão América: Guerra Civil, Natasha Romanoff confronta os episódios mais sombrios de seu passado quando surge uma conspiração perigosa.', 1);

INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Muito empolgante, recomendo!', 1, 1);
INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Romance cativante, amei!', 2, 1);
INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Ação de tirar o fôlego!', 3, 1);
