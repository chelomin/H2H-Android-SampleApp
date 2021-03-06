package itutorgroup.h2h.adapter.delegate;

import android.widget.TextView;

import com.zhy.adapter.abslistview.ViewHolder;
import com.zhy.adapter.abslistview.base.ItemViewDelegate;

import itutorgroup.h2h.R;
import itutorgroup.h2h.bean.ChatMessage;

/**
 * 描述:
 * 作者：znb
 * 时间：2016年07月13日 11:14
 * 邮箱：nianbin@mosainet.com
 */
public class MsgSendItemDelegate implements ItemViewDelegate<ChatMessage> {
    @Override
    public int getItemViewLayoutId() {
        return R.layout.item_listformat_chatmsg_send;
    }

    @Override
    public boolean isForViewType(ChatMessage item, int position) {
        return item.msgSend;
    }

    @Override
    public void convert(ViewHolder holder, ChatMessage chatMessage, int position) {
        TextView tvName = holder.getView(R.id.tv_name);
        TextView tvContent = holder.getView(R.id.tv_content);
        tvName.setText(chatMessage.name);
        tvContent.setText(chatMessage.content);
    }
}
