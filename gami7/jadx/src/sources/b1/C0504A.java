package b1;

import android.graphics.Insets;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import s.RunnableC1149B;
import s.Z;

/* renamed from: b1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504A extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC1149B f7073a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7074b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7075c;

    public C0504A(RunnableC1149B runnableC1149B) {
        super(runnableC1149B.f10038i);
        this.f7075c = new HashMap();
        this.f7073a = runnableC1149B;
    }

    public final C0507D a(WindowInsetsAnimation windowInsetsAnimation) {
        C0507D c0507d = (C0507D) this.f7075c.get(windowInsetsAnimation);
        if (c0507d == null) {
            c0507d = new C0507D(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0507d.f7080a = new C0505B(windowInsetsAnimation);
            }
            this.f7075c.put(windowInsetsAnimation, c0507d);
        }
        return c0507d;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f7073a.b(a(windowInsetsAnimation));
        this.f7075c.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        RunnableC1149B runnableC1149B = this.f7073a;
        a(windowInsetsAnimation);
        runnableC1149B.f10040k = true;
        runnableC1149B.f10041l = true;
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f7074b;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f7074b = arrayList2;
            Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation l3 = D0.i.l(list.get(size));
            C0507D a3 = a(l3);
            fraction = l3.getFraction();
            a3.f7080a.c(fraction);
            this.f7074b.add(a3);
        }
        RunnableC1149B runnableC1149B = this.f7073a;
        C0521S b3 = C0521S.b(null, windowInsets);
        Z z3 = runnableC1149B.f10039j;
        Z.a(z3, b3);
        if (z3.f10108r) {
            b3 = C0521S.f7110b;
        }
        return b3.a();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        RunnableC1149B runnableC1149B = this.f7073a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        W0.b c3 = W0.b.c(lowerBound);
        upperBound = bounds.getUpperBound();
        W0.b c4 = W0.b.c(upperBound);
        runnableC1149B.f10040k = false;
        D0.i.o();
        return D0.i.j(c3.d(), c4.d());
    }
}
