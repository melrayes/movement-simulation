import React from 'react';
import Block from './Block';

export default ({
    blocks
}) => (<div className="blocks">
    { blocks.map(block => <Block block={block} key={block.key}/>)}
</div>)
