"use strict"
var auth = auth || {}
auth = (()=>{
	let _,js,router_js
	  let init =()=>{
	     _=$.ctx()

	  }
	 let onCreate=()=>{
		 $.when(
				 
		 ).done(()=>{
			 setContentView()
		 })
	 }
	 let setContentView =()=>{
		 home()
	 }
	 let home =()=>{
		 alert('hello 정승')
	 }
	 return{onCreate}
})()