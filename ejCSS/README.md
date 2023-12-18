Ej3:
1--> p
2 --> #me
3 --> .lol
4 --> .lol.wut
5 --> p.meh
6 -->p,#bop


Ej5:
1 --> li:first-child
2 --> p:not(.foo)
3 --> li:nth-child(2n+3)
4 --> div > *
5 --> span[data-item]
6 --> p ~ span
7 --> input:enabled, button:enabled 
8 --> #one, #two, #five, #six, #nine
9 --> a + span
10 -->div[id="foo"] > div[class="foo"]
11 --> div div span ~ code:not(.foo)

Ej6:

RECORDATORIO !IMPORTANT NO ES UN SELECTOR AUNQUE SU PESO ES EL MÁS ELEVADO

Ordena los siguientes selectores --> * , container, container href, h1, #titulo, important
De mayor peso a menor:
- !important (No es un selector pero si es el que mas peso tiene) 1,0,0,0
- #Titulo --> 1,0,0
- container href -->0,1,1
- container --> 0,1,0
- h1 --> 0,0,1
- * --> 0,0,0
