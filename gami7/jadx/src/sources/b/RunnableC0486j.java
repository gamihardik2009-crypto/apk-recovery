package b;

import J.W0;
import android.content.Intent;
import android.content.IntentSender;
import q1.C1059a;

/* renamed from: b.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0486j implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6986h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6987i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6988j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6989k;

    public /* synthetic */ RunnableC0486j(int i2, int i3, Object obj, Object obj2) {
        this.f6986h = i3;
        this.f6987i = obj;
        this.f6988j = i2;
        this.f6989k = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6986h) {
            case 0:
                C0487k c0487k = (C0487k) this.f6987i;
                z2.h.f(c0487k, "this$0");
                Object obj = ((N.e) this.f6989k).f4952a;
                String str = (String) c0487k.f6990a.get(Integer.valueOf(this.f6988j));
                if (str != null) {
                    e.b bVar = (e.b) c0487k.f6994e.get(str);
                    if ((bVar != null ? bVar.f7537a : null) != null) {
                        C1.q qVar = bVar.f7537a;
                        z2.h.d(qVar, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (c0487k.f6993d.remove(str)) {
                            ((y2.c) ((W0) qVar.f677h).getValue()).l(obj);
                            break;
                        }
                    } else {
                        c0487k.f6996g.remove(str);
                        c0487k.f6995f.put(str, obj);
                        break;
                    }
                }
                break;
            case 1:
                C0487k c0487k2 = (C0487k) this.f6987i;
                z2.h.f(c0487k2, "this$0");
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.f6989k;
                z2.h.f(sendIntentException, "$e");
                c0487k2.a(this.f6988j, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
            default:
                ((C1059a) this.f6987i).f9738b.h(this.f6988j, this.f6989k);
                break;
        }
    }
}
