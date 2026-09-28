package androidx.emoji2.text;

import B.F;
import android.content.Context;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.InterfaceC0470t;
import androidx.lifecycle.ProcessLifecycleInitializer;
import g1.C0687i;
import g1.C0688j;
import g1.r;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import y1.C1399a;
import y1.InterfaceC1400b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC1400b {
    @Override // y1.InterfaceC1400b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // y1.InterfaceC1400b
    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        r rVar = new r(new F(context));
        rVar.f7754b = 1;
        if (C0687i.f7719k == null) {
            synchronized (C0687i.f7718j) {
                try {
                    if (C0687i.f7719k == null) {
                        C0687i.f7719k = new C0687i(rVar);
                    }
                } finally {
                }
            }
        }
        C1399a c3 = C1399a.c(context);
        c3.getClass();
        synchronized (C1399a.f11490e) {
            try {
                obj = c3.f11491a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c3.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C0472v e3 = ((InterfaceC0470t) obj).e();
        e3.a(new C0688j(this, e3));
    }
}
