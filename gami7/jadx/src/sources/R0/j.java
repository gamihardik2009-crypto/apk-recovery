package R0;

import android.os.Handler;
import android.os.Looper;
import m2.C0880v;
import r0.InterfaceC1129r;

/* loaded from: classes.dex */
public final class j extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5413i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f5414j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(x xVar, int i2) {
        super(1);
        this.f5413i = i2;
        this.f5414j = xVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f5413i) {
            case 0:
                InterfaceC1129r t3 = ((InterfaceC1129r) obj).t();
                z2.h.c(t3);
                this.f5414j.k(t3);
                break;
            case 1:
                O0.j jVar = new O0.j(((O0.j) obj).f5147a);
                x xVar = this.f5414j;
                xVar.m1setPopupContentSizefhxjrPA(jVar);
                xVar.l();
                break;
            default:
                y2.a aVar = (y2.a) obj;
                x xVar2 = this.f5414j;
                Handler handler = xVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.c();
                } else {
                    Handler handler2 = xVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new v(aVar, 0));
                    }
                }
                break;
        }
        return C0880v.f8657a;
    }
}
