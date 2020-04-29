import React from 'react';
 
const list = [
  {
    id: '101',
    ptoductname: 'mobile'
  },
  {
    id: '102',
    ptoductname: 'camera'
  },
  {
    id: '103',
    ptoductname: 'laptop'
  },
];
 
const ComplexList = () => (
  <ul>
    {list.map(item => (
      <li key={item.id}>
        <div>{item.id}</div>
        <div>{item.ptoductname}</div>
      </li>
    ))}
  </ul>
);
export default ComplexList;