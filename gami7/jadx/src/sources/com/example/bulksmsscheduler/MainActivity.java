package com.example.bulksmsscheduler;

import B1.B;
import B1.C;
import B1.s;
import B1.v;
import C1.p;
import C1.w;
import K1.o;
import P1.d;
import R.a;
import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Q;
import b.AbstractActivityC0489m;
import c.AbstractC0553c;
import com.example.bulksmsscheduler.utils.SmsWorker;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import n2.AbstractC0962n;
import u0.C1294k0;
import z2.h;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0489m {
    @Override // b.AbstractActivityC0489m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        h.f(timeUnit, "repeatIntervalTimeUnit");
        v vVar = new v(SmsWorker.class, 1);
        o oVar = vVar.f311c;
        long millis = timeUnit.toMillis(15L);
        oVar.getClass();
        String str = o.f4563x;
        if (millis < 900000) {
            s.d().g(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long y3 = C.y(millis, 900000L);
        long y4 = C.y(millis, 900000L);
        if (y3 < 900000) {
            s.d().g(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        oVar.f4571h = C.y(y3, 900000L);
        if (y4 < 300000) {
            s.d().g(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (y4 > oVar.f4571h) {
            s.d().g(str, "Flex duration greater than interval duration; Changed to " + y3);
        }
        oVar.f4572i = C.D(y4, 300000L, oVar.f4571h);
        vVar.f309a = true;
        o oVar2 = vVar.f311c;
        oVar2.f4575l = 2;
        long millis2 = timeUnit.toMillis(1L);
        if (millis2 > 18000000) {
            s.d().g(str, "Backoff delay duration exceeds maximum value");
        }
        if (millis2 < 10000) {
            s.d().g(str, "Backoff delay duration less than minimum value");
        }
        oVar2.f4576m = C.D(millis2, 10000L, 18000000L);
        new p(w.o0(this), "SmsWorker", 2, Collections.singletonList((B) vVar.a())).I();
        a aVar = d.f5236b;
        ViewGroup.LayoutParams layoutParams = AbstractC0553c.f7164a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C1294k0 c1294k0 = childAt instanceof C1294k0 ? (C1294k0) childAt : null;
        if (c1294k0 != null) {
            c1294k0.setParentCompositionContext(null);
            c1294k0.setContent(aVar);
            return;
        }
        C1294k0 c1294k02 = new C1294k0(this);
        c1294k02.setParentCompositionContext(null);
        c1294k02.setContent(aVar);
        View decorView = getWindow().getDecorView();
        if (Q.g(decorView) == null) {
            Q.l(decorView, this);
        }
        if (Q.h(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (AbstractC0962n.h(decorView) == null) {
            AbstractC0962n.p(decorView, this);
        }
        setContentView(c1294k02, AbstractC0553c.f7164a);
    }
}
