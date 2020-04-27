import React,{Component} from 'react';
import Hero from './Hero';
import ErrorBounderExample from './ErrorBounderExample';

class ShowHero extends Component{
    render(){
        return(
            <ErrorBounderExample >
                <Hero heroName="Rajkumar" />
                <Hero heroName="Rajnikanth" />
                <Hero heroName="Joker" />
                </ErrorBounderExample>
        )
    }
}

export default ShowHero