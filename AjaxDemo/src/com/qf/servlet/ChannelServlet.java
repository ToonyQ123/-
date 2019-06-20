package com.qf.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONString;

import jdk.nashorn.internal.runtime.JSONFunctions;

import com.alibaba.fastjson.JSON;
import com.qf.bean.Channel;

/**
 * Servlet implementation class ChannelServlet
 */
@WebServlet("/channel")
public class ChannelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChannelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String level =request.getParameter("level");
		String patent=request.getParameter("patent");
		ArrayList<Channel> ch=new ArrayList<>();
		if (level.equals("1")) {
			ch.add(new Channel("sx","陕西省"));
			ch.add(new Channel("hn","湖南省"));
		}else if (level.equals("2")) {
			if (patent.equals("sx")) {
				ch.add(new Channel("xa", "西安"));
				ch.add(new Channel("wn", "渭南"));
				ch.add(new Channel("fp", "富平"));
				ch.add(new Channel("other", "..."));
			}else if (patent.equals("hn")) {
				ch.add(new Channel("xa1", "西安1"));
				ch.add(new Channel("wn1", "渭南1"));
				ch.add(new Channel("fp1", "富平1"));
				ch.add(new Channel("other", "..."));
			}
		}
		String json=JSON.toJSONString(ch);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(json);
	}

}
