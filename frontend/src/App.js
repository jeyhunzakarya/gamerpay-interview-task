import logo from './logo.svg';
import './App.css';
import { Flex, TextInput } from '@mantine/core';
import { Button } from '@mantine/core';
import { useState } from 'react';

function App() {
  const [input, setInput] = useState("")
  return (
    <div className="App">
      <Flex
        gap={"sm"}
        direction={"column"}
        m="20px auto 0 auto"
        w="50%"
      >
        <TextInput
          value={input}
          onChange={(e) => setInput(e.currentTarget.value)}
          placeholder="Type anything"
          label="User Input"
          withAsterisk
        />
        <Button w="20%" type='submit'>
          Submit input
        </Button>
      </Flex>
    </div>
  );
}

export default App;
