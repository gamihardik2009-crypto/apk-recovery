package b1;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.example.bulksmsscheduler.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: b1.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541r {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f7128d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f7129a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f7130b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f7131c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f7129a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a3 = a(viewGroup.getChildAt(childCount));
                    if (a3 != null) {
                        return a3;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                B1.t.w(arrayList.get(size));
                throw null;
            }
        }
        return null;
    }
}
