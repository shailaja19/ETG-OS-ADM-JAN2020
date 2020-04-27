import React,{Component} from 'react';

class ProductList extends Component{
    render(){
        const Product=[{id:1, name:'TV', rate:123},
                         {id:2, name:'mobile', rate:456},
                         {id:3, name:'Laptop', rate:789}
    ]
    const productList = Product.map(product=><h1>{product.id} {product.name} {product.rate}</h1>)
    return(
        <div>
            <h2>{this.props.show}</h2>
            <p>{this.props.children}</p>
            <ul>
                <li>{productList}</li>
            </ul>
        </div>
    )
    }
}
export default ProductList;