 import React ,{Component} from 'react';
 import Simple from './Simple';

 class SimpleFragment extends Component{
     render(){
         return(
             <table>
                 <tr><Simple/></tr>
                 <tr><Simple/></tr>
             </table>
         )
     }
 }
 export default SimpleFragment;