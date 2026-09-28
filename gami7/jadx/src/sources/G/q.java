package G;

import android.content.Context;
import android.view.ViewGroup;
import com.example.bulksmsscheduler.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q extends ViewGroup {

    /* renamed from: h, reason: collision with root package name */
    public final int f1188h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1189i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1190j;

    /* renamed from: k, reason: collision with root package name */
    public final K1.s f1191k;

    /* renamed from: l, reason: collision with root package name */
    public int f1192l;

    public q(Context context) {
        super(context);
        this.f1188h = 5;
        ArrayList arrayList = new ArrayList();
        this.f1189i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f1190j = arrayList2;
        this.f1191k = new K1.s();
        setClipChildren(false);
        r rVar = new r(context);
        addView(rVar);
        arrayList.add(rVar);
        arrayList2.add(rVar);
        this.f1192l = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }
}
