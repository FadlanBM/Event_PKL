import React from 'react'
import ornament1 from '../assets/ornament1.svg'
import CTA from '../components/CTA'

const HomeContent = () => {
  return (
    <div className="mt-[2.75rem]">
        <h1 className="font-main text-[65px] leading-[4.75rem] font-semibold text-white">Reliable, secure<span><img className="inline align-top" src={ornament1}/></span><br/>conference to get<br/>the best events</h1>
        <p className="font-main text-[18px] text-[#CFCFD1] mt-[24px]">Hold incredible events, share knowledge, build and grow your<br/>product , create opportunity</p>
        <CTA />
    </div>
  )
}

export default HomeContent