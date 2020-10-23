# baseService

Para Probar el POST de un alquiler: curl -X POST -H 'Content-Type: application/json' -i http://localhost:8080/baseService/rental --data '{"movieId":1,"memberId":1}'

Para Probar el POST de un socio: curl -X POST -H 'Content-Type: application/json' -i http://localhost:8080/baseService/member --data '{"name":"Pedro","lastname":"Pedrito","dni":"a44128","email":"prueba@test.test"}'

Para Probar el GET de las peliculas: http://localhost:8080/baseService/movie

Para Probar el GET de una pelicula por ID: http://localhost:8080/baseService/movie/2
