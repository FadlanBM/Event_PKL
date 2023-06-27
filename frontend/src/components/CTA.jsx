import { useNavigate } from 'react-router-dom'
import React from 'react'

const CTA = () => {
  const navigate = useNavigate()

  return (
    <div className="mt-[35px]">
      <button
      className="flex justify-center items-center bg-[#E14817] w-[170px] h-[45px] rounded-[8px] text-white"
      onClick={() => navigate('/join')} 
      >Join a Meeting</button>
    </div>
  )
}

export default CTA