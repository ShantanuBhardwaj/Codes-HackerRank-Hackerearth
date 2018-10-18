#include<stdio.h>
int checkPrime(int a,int b);
void main(){
	int num;
	scanf("%d",&num);
	int check = checkPrime(a,(a/2));
	if(check==1){
		printf("Prime");
	}
	else{
		printf("not Prime");
	}
}
int checkPrime(int a,int b){
	if(b==1){
	return 0;
	}
	else{
	if(a%b==0){
	return 1;
	}
	else{
		return checkPrime(a,b-1);
	}
	}
}