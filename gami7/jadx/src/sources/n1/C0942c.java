package n1;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

@C("activity")
/* renamed from: n1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0942c extends D {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f9024c;

    public C0942c(Context context) {
        Object obj;
        z2.h.f(context, "context");
        Iterator it = G2.i.i0(context, C0941b.f9016j).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f9024c = (Activity) obj;
    }

    @Override // n1.D
    public final s a() {
        return new C0940a(this);
    }

    @Override // n1.D
    public final s c(s sVar) {
        throw new IllegalStateException(("Destination " + ((C0940a) sVar).f9093n + " does not have an Intent set.").toString());
    }

    @Override // n1.D
    public final boolean f() {
        Activity activity = this.f9024c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
