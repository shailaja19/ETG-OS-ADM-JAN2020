import React from 'react';
import ProductList from './ProductList';


function ListNames(){
    const names=['Bhagya','Hampi','Sonu','Nilesh','Meghu'];
     const nameList = names.map(name=><li>{name}</li>)
     return(
         <div>
            
                 <h2>The list names Details </h2>
                 <ol>{nameList}</ol>
                <ProductList show="Products">
                     product list
                 </ProductList>
             
         </div>
     )
}
export default ListNames;