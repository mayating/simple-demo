package cn.myt.demo.interceptor;

/**
 * @description 用户登陆拦截器
 * @author: mayating
 * @date: 2022/1/2
 */
//public class LoginInterceptor implements HandlerInterceptor {
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        //从header中获取token
//        String token = request.getHeader("token");
//        //如果token为空
//        if (StringUtils.isBlank(token)) {
//            setReturn(response, 401, "用户未登录，请先登录");
//            return false;
//        }
//        //在实际使用中还会:
//        // 1、校验token是否能够解密出用户信息来获取访问者
//        // 2、token是否已经过期
//        return true;
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//    }
//
//    //返回json格式错误信息
//    private static void setReturn(HttpServletResponse response, Integer code, String msg) throws IOException {
//        HttpServletResponse httpResponse = (HttpServletResponse) response;
//        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
//        httpResponse.setHeader("Access-Control-Allow-Origin", HttpContextUtil.getOrigin());
//        //UTF-8编码
//        httpResponse.setCharacterEncoding("UTF-8");
//        response.setContentType("application/json;charset=utf-8");
//        Result result = new Result(code, msg, "");
//        ObjectMapper objectMapper = new ObjectMapper();
//        String json = objectMapper.writeValueAsString(result);
//        httpResponse.getWriter().print(json);
//    }
//
//}
