import React from 'react';
import {Route,Link,BrowserRouter as Router , Switch} from 'react-router-dom';
import Message  from './ReactExample/StateExample';
import SimpleFragment from './ReactExample/SimpleFragment'
 import App from '../App';
const routing =(
    <Router>

<div>
    <ul>
        <li>
        <link  to = "/"> Message</link>
        </li>
        <li>
        <link  to = "/">SimpleFragment </link>
        </li>
    </ul>
    <Switch>
        <Route excat path="/" component={App}/>
        <Route path="/message" component={Message}/>
        <Route path="/SimpleFragment" component={SimpleFragment}/>
        
    </Switch>
</div>
    </Router>
)
export default routing;