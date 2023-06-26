import React from 'react'
import HomeContent from '../components/HomeContent'
import Hero from '../assets/hero.png'

const Home = () => {
  return (
    <div className="flex px-[80px] mt-10">
      <HomeContent />
      <img className="ml-[6.33rem]" src={Hero}/>
    </div>
  )
}

export default Home;