package V1;

import B1.v;
import C1.w;
import J2.B;
import W1.N;
import W1.P;
import Y1.H;
import a2.l;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.Q;
import com.example.bulksmsscheduler.utils.SmsWorker;
import m2.C0880v;
import z2.h;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements y2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5879h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5880i;

    public /* synthetic */ a(int i2, Object obj) {
        this.f5879h = i2;
        this.f5880i = obj;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f5879h) {
            case 0:
                b bVar = (b) this.f5880i;
                h.f(bVar, "this$0");
                Context context = bVar.f5882b;
                if (context != null) {
                    Log.d("SmsWorker", "Enqueuing immediate worker");
                    w.o0(context).O((B1.w) new v(SmsWorker.class, 0).a());
                }
                break;
            case 1:
                P p3 = (P) this.f5880i;
                h.f(p3, "$viewModel");
                B.r(Q.j(p3), null, 0, new N(p3, null), 3);
                break;
            case 2:
                H h2 = (H) this.f5880i;
                h.f(h2, "$viewModel");
                h2.f6271i.k(Boolean.FALSE);
                break;
            case 3:
                l lVar = (l) this.f5880i;
                h.f(lVar, "$viewModel");
                B.r(Q.j(lVar), null, 0, new a2.h(lVar, null), 3);
                break;
            default:
                Context context2 = (Context) this.f5880i;
                h.f(context2, "$context");
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + context2.getPackageName()));
                    context2.startActivity(intent);
                } catch (Exception unused) {
                    context2.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
                }
                break;
        }
        return C0880v.f8657a;
    }
}
