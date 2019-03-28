/*
 *
 *  * 文 件 名:  SampleBrowser.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-1-31 下午1:48
 *
 */

package com.example.stack;

/**
 *
 * @author wangzhao
 * @version [版本号, 2019/1/31]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class SampleBrowser
{
    private String currentPage;

    private LinkedListBaseStack backStack;

    private LinkedListBaseStack forwardStack;

    public static void main(String[] args) {
        SampleBrowser browser = new SampleBrowser();
        browser.open("http://www.baidu.com");
        browser.open("http://news.baidu.com/");
        browser.open("http://news.baidu.com/ent");
        browser.goBack();
        browser.goBack();
        browser.goForward();
        browser.open("http://www.qq.com");
        browser.goForward();
        browser.goBack();
        browser.goForward();
        browser.goBack();
        browser.goBack();
        browser.goBack();
        browser.goBack();
        browser.checkCurrentPage();
    }

    public SampleBrowser()
    {
        this.backStack = new LinkedListBaseStack();
        this.forwardStack = new LinkedListBaseStack();
    }

    public void open(String url)
    {
        if(this.currentPage != null)
        {
            this.backStack.push(url);
            this.forwardStack.clear();
        }
        showUrl(url,"Open");
    }

    public boolean canGoBack()
    {
        return this.backStack.size()>0;
    }

    public boolean canGoForward()
    {
        return this.forwardStack.size()>0;
    }

    public String goBack()
    {
        if(this.canGoBack())
        {
            this.forwardStack.push(currentPage);
            String backUrl = this.backStack.pop();
            showUrl(backUrl,"Back");
            return backUrl;
        }

        System.out.println("--- can not go back, no pages behind.");
        return null;
    }

    public String goForward()
    {
        if(this.canGoForward())
        {
            this.backStack.push(currentPage);
            String forwardUrl = this.forwardStack.pop();
            showUrl(forwardUrl,"Forward");
            return forwardUrl;
        }

        System.out.println("--- can not go forward, no pages ahead.");
        return null;
    }

    public void showUrl(String url, String prefix)
    {
        this.currentPage = url;
        System.out.println(prefix + " page == "+url);
    }

    public void checkCurrentPage()
    {
        System.out.println("Current page is: " + this.currentPage);
    }


    public static class LinkedListBaseStack
    {
        private Node top;
        private int size;

        static Node createNode(String data, Node next)
        {
            return new Node(data,next);
        }

        public void clear()
        {
            this.top = null;
            this.size = 0;
        }

        public void push(String data)
        {
            Node node = createNode(data ,this.top);
            this.top = node;
            this.size++;
        }

        public String pop()
        {
            Node popNode = this.top;
            if(popNode == null)
            {
                System.out.println("this stack is empty");
                return null;
            }
            this.top = popNode.next;
            if(this.size>0)
            {
                this.size--;
            }
            return popNode.getData();
        }

        public String getTopData()
        {
            if (this.top == null)
            {
                return null;
            }
            return this.top.getData();
        }

        public int size()
        {
            return this.size;
        }

        public void printAll()
        {
            System.out.println("---print stack---");
            Node currentNode = this.top;
            while (currentNode != null)
            {
                System.out.println(currentNode.getData()+"->");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    public static class Node {

        private String data;
        private Node next;

        public Node(String data) {
            this(data, null);
        }

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getData() {
            return this.data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }
    }
}
