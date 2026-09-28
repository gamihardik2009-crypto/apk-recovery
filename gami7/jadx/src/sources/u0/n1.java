package u0;

import J.AbstractC0288s;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.example.bulksmsscheduler.R;
import java.util.LinkedHashMap;
import n2.AbstractC0948C;

/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f11117a = new LinkedHashMap();

    public static final M2.b0 a(Context context) {
        M2.b0 b0Var;
        LinkedHashMap linkedHashMap = f11117a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    L2.g c3 = B2.a.c(-1, 0, 6);
                    G1.h hVar = new G1.h(2, new l1(contentResolver, uriFor, new m1(c3, C1.y.m(Looper.getMainLooper())), c3, context, null));
                    J2.q0 q0Var = new J2.q0(null);
                    Q2.d dVar = J2.H.f4356a;
                    obj = M2.P.n(hVar, new O2.e(AbstractC0948C.n(q0Var, O2.o.f5202a)), M2.T.a(0L, 3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                b0Var = (M2.b0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b0Var;
    }

    public static final AbstractC0288s b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC0288s) {
            return (AbstractC0288s) tag;
        }
        return null;
    }
}
