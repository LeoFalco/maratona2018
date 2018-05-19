#include <stdio.h>

int main(){
	
	        
    int min = 0;
	int amigo = 0;
	
	char primeira;
    int linhas;
	
	scanf("%c %d", &primeira, &linhas);
	fflush(stdin);
	
	int nota;
    for(int i = 0; i < linhas; i ++){
    	scanf("%d", &nota);
    	if(primeira == 'V'){
        	if(i%2 == 0){
            	min += nota;
        	}else{
            	amigo += nota;
        	}
    	}else{// A
        	if(i%2 == 0){
            	amigo += nota;
        	}else{
            	min += nota;
        	}
    	}
	}
	
	printf("VOCE: %d AMIGO: %d\n", min, amigo);
}
