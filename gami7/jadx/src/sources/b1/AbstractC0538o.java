package b1;

import android.view.View;
import com.example.bulksmsscheduler.R;
import d1.AbstractC0649a;
import j.C0741G;
import java.util.Objects;

/* renamed from: b1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0538o {
    public static void a(View view, InterfaceC0540q interfaceC0540q) {
        C0741G c0741g = (C0741G) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0741g == null) {
            c0741g = new C0741G(0);
            view.setTag(R.id.tag_unhandled_key_listeners, c0741g);
        }
        Objects.requireNonNull(interfaceC0540q);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0537n = new ViewOnUnhandledKeyEventListenerC0537n();
        c0741g.put(interfaceC0540q, viewOnUnhandledKeyEventListenerC0537n);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0537n);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, InterfaceC0540q interfaceC0540q) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0741G c0741g = (C0741G) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0741g == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0741g.get(interfaceC0540q)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    public static void g(View view, boolean z3) {
        view.setAccessibilityHeading(z3);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AbstractC0649a abstractC0649a) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}
